SUMMARY = "A demo image for PIC64-HPSC/HX"
LICENSE = "MIT"

inherit core-image

# Other tools such as dev_cfg expect the name of the rootfs to have a specific
# name. Fix it so that these tools don't break.
#
IMAGE_BASENAME = "core-image-base"
