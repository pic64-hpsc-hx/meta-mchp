DESCRIPTION = "P64H UIO driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_uio"

RPROVIDES:${PN} += "kernel-module-p64h-uio"
