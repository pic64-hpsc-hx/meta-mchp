DESCRIPTION = "P64H RDMA driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_rdma"

RPROVIDES:${PN} += "kernel-module-grovf-rdma"
