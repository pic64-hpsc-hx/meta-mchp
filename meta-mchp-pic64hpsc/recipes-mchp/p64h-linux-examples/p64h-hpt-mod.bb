DESCRIPTION = "P64H High Performance Timer (HPT) driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_hpt"

RPROVIDES:${PN} += "kernel-module-p64h-hpt"
