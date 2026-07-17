DESCRIPTION = "P64H PCIe/CXL driver"

require p64h-linux-examples-module.inc

P64H_DRIVER_DIR = "p64h_pcie_cxl"

RPROVIDES:${PN} += "kernel-module-p64h-pcie"
