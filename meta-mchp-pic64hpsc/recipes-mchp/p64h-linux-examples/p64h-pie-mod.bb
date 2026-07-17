DESCRIPTION = "P64H Packet Insert Extract (PIE) driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_pie"

RPROVIDES:${PN} += "kernel-module-p64h-pie"
