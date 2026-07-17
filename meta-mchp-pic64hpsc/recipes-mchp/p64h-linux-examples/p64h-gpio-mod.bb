DESCRIPTION = "P64H GPIO driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_gpio"

RPROVIDES:${PN} += "kernel-module-p64h-gpio"
