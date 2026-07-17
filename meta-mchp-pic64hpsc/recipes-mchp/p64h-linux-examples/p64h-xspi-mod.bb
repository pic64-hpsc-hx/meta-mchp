DESCRIPTION = "P64H XSPI driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "spi-microchip-p64h_xspi"

RPROVIDES:${PN} += "kernel-module-spi-microchip-p64h-xspi"
