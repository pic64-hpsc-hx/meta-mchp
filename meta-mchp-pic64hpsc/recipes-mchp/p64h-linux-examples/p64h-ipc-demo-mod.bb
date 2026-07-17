DESCRIPTION = "P64H IPC Demo driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_ipc"

RPROVIDES:${PN} += "kernel-module-p64h-ipc-demo"
