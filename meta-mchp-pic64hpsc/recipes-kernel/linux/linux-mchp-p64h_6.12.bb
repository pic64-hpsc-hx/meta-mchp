DESCRIPTION = "Linux kernel for Microchip SoCs including PIC64-HPSC"
SUMMARY = "Linux kernel for Microchip SoCs including PIC64-HPSC"

require recipes-kernel/linux/linux-yocto.inc

KCONFIG_MODE="--alldefconfig"

PV = "${LINUX_VERSION}+git${SRCPV}"
KERNEL_VERSION_SANITY_SKIP="1"

# Get rid of the "-yocto-standard" part of the kernel version string as it
# exceeds 64 chars with it.
LINUX_VERSION_EXTENSION=""

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/pic64-hpsc-hx/linux.git;protocol=http;branch=${KBRANCH}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "6.12.22"
KBRANCH = "linux4microchip+fpga.p64h-2025.07"
SRCREV = "7b2930f634deab98b423af0920b40dbcb4e82c66"

