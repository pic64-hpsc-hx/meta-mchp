DESCRIPTION = "General Purpose Input/Output (X288 L2 Prefetcher) driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "x288_l2pf"

RPROVIDES:${PN} += "kernel-module-x288-l2pf"
