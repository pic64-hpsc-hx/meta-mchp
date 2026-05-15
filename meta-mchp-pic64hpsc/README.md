# meta-mchp-pic64hpsc

This is a BSP layer for the PIC64-HPSC/HX SoC.

meta-mchp-pic64hpsc provides a machine configuration file for the following boards:

  - HX1000-KIT: https://www.microchip.com/en-us/development-tool/hx1000-kit

## Existing Yocto build

If you already have a yocto workspace, clone this repository, add
"meta-mchp-pic64hpsc" and "meta-mchp-common" to `BBLAYERS` and set `MACHINE` to
"pic64hpsc".

## New Yocto build

If you do not already have a yocto workspace, this repository also provides a
KAS [1] configuration for core-image-minimal using the poky distribution and the
pic64hpsc machine.

If using this KAS configuration, it is recommended to build it in the docker
container provided in `.cqfd/docker/Dockerfile`. Build this container with:

```
./cqfd init
```

NOTE: You need a Linux host machine with support for Docker

Build the Yocto image with:

```
./cqfd
```

NOTE: This will take about 2 hours and consume 100G of disk.

Your output will be in `build/tmp/deploy/images/pic64hpsc/`

[1]: https://kas.readthedocs.io/en/1.0/


