SUMMARY = "A demo image for PIC64-HPSC/HX"
LICENSE = "MIT"

inherit core-image

# Other tools such as dev_cfg expect the name of the rootfs to have a specific
# name. Fix it so that these tools don't break.
#
IMAGE_BASENAME = "core-image-base"

IMAGE_FEATURES += "ssh-server-dropbear"

# Utilities for system administration and device configuration
IMAGE_INSTALL += "\
    util-linux \
    libgpiod-tools \
    i2c-tools \
    pciutils \
"
