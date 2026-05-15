#@TYPE: Machine
#@NAME: pic64hpsc
#@DESCRIPTION: PIC64-HPSC/HX (High Performance Space Computer)

require conf/machine/include/riscv/tune-riscv.inc
require conf/machine/include/soc-family.inc

SOC_FAMILY = "pic64hpsc"
DEFAULTTUNE = "riscv64"

# Kernel
PREFERRED_PROVIDER_virtual/kernel:pic64hpsc = "linux-mchp-p64h"
PREFERRED_VERSION_linux-mchp = "6.12%"
KERNEL_IMAGETYPE = "Image"
KBUILD_DEFCONFIG ?= "p64h_defconfig"
# Don't include the kernel in /boot
RRECOMMENDS:${KERNEL_PACKAGE_NAME}-base = ""
