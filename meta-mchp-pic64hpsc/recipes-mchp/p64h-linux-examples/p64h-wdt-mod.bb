DESCRIPTION = "P64H Watchdog driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_wdt"

RPROVIDES:${PN} += "kernel-module-p64h-wdt"
