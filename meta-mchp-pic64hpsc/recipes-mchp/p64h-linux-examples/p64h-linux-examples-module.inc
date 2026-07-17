require p64h-linux-examples.inc
inherit module

EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"

do_compile[dirs] = "${S}/drivers/${P64H_DRIVER_DIR}"
do_install[dirs] = "${S}/drivers/${P64H_DRIVER_DIR}"
MODULES_MODULE_SYMVERS_LOCATION = "drivers/${P64H_DRIVER_DIR}"
