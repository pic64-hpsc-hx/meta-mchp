SUMMARY = "RISC-V Open Source Supervisor Binary Interface (OpenSBI)"
DESCRIPTION = "OpenSBI aims to provide an open-source and extensible implementation of the RISC-V SBI specification for a platform specific firmware (M-mode) and a general purpose OS, hypervisor or bootloader (S-mode or HS-mode). OpenSBI implementation can be easily extended by RISC-V platform or System-on-Chip vendors to fit a particular hadware configuration."
HOMEPAGE = "https://github.com/riscv/opensbi"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING.BSD;md5=42dd9555eb177f35150cf9aa240b61e5"

inherit deploy

SRCREV = "74434f255873d74e56cc50aa762d1caf24c099f8"
SRC_URI = "git://github.com/riscv/opensbi.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

TARGET_DBGSRC_DIR = "/share/opensbi/*/generic/firmware/"

TARGET_CC_ARCH += "${LDFLAGS}"

RISCV_SBI_FW_TEXT_START ??= "0x80000000"
EXTRA_OEMAKE += "\
    REPRODUCIBLE=y \
    CROSS_COMPILE=${HOST_PREFIX} \
    ELFFLAGS="${LDFLAGS}" \
    PLATFORM=${RISCV_SBI_PLAT} \
    I=${D} \
    FW_TEXT_START=${RISCV_SBI_FW_TEXT_START} \
    PLATFORM_DEFCONFIG=${RISCV_SBI_DEFCONFIG} \
"
EXTRA_OEMAKE:append:toolchain-clang = " LLVM=y"

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake DESTDIR=${D} install
	# In the future these might be required as a dependency for other packages.
	# At the moment just delete them to avoid warnings
	rm -r ${D}/include
	rm -r ${D}/lib*
	rm -r ${D}/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/payloads
}

do_deploy () {
	install -m 755 ${D}/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_payload.* ${DEPLOYDIR}/
	install -m 755 ${D}/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_jump.* ${DEPLOYDIR}/
	install -m 755 ${D}/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_dynamic.* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

FILES:${PN} += "/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_jump.*"
FILES:${PN} += "/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_payload.*"
FILES:${PN} += "/share/opensbi/*/${RISCV_SBI_PLAT}/firmware/fw_dynamic.*"

COMPATIBLE_HOST = "(riscv64|riscv32).*"

# PIC64-HPSC/HX specific
SRC_URI:append:pic64hpsc = " file://hpsc-defconfig"

do_copy_defconfig() {
    for file in $(find ${WORKDIR} -maxdepth 1 -type f -name *defconfig); do
        echo "Copy $file"
        cp "$file" "${S}/platform/generic/configs/"
    done
}
do_patch[postfuncs] += "do_copy_defconfig"
