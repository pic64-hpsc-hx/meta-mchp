require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/README;beginline=1;endline=22;md5=b20e22cd4fb2b4c9b05c36b30d58eb89"

DEPENDS += "coreutils-native gnutls-native"

SRC_URI = "git://github.com/pic64-hpsc-hx/u-boot-mchp.git;protocol=http;branch=${UBRANCH}"
SRCREV	= "30bc338b159f5953a5c6bd7e254f92acc717577a"
UBRANCH = "u-boot-2024.07-mchp+p64h"
