SUMMARY = "A demo image for PIC64-HPSC/HX"
LICENSE = "MIT"

inherit core-image

# Other tools such as dev_cfg expect the name of the rootfs to have a specific
# name. Fix it so that these tools don't break.
#
IMAGE_BASENAME = "core-image-base"

IMAGE_FEATURES += "ssh-server-dropbear"

# Utilities for system administration and device configuration
IMAGE_INSTALL += " \
    util-linux-wdctl \
    util-linux-fdisk \
    util-linux-lscpu \
    util-linux-hwclock \
    util-linux-dmesg \
    util-linux-findmnt \
    util-linux-chrt \
    util-linux-mount \
    util-linux-fsck \
    util-linux-mkfs \
    mtd-utils \
    mmc-utils \
    e2fsprogs \
    libgpiod-tools \
    i2c-tools \
    pciutils \
    linuxptp \
"
