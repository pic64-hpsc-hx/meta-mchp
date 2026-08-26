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

LINUX_VERSION = "6.18.35"
KBRANCH = "linux-6.18.35-mchp+p64h"
SRCREV = "8a92c548149b760d7afc010f6aafb9da08901013"

# do_kernel_configcheck: config analysis failed when running 'symbol_why.py ...
# This will be fixed migrating to Yocto 6.0 (Wrynose)
#
do_kernel_configcheck[noexec] = "1"
