FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "CLOSED"

inherit module

SRC_URI = " \
    file://gpio_ctl.c \
    file://gpio_ctl.h \
    file://gpio_ctl_shared.h \
    file://Makefile \
"

#SRC_URI = "    git://github.com/jucas97/LKM-custom-gpio-ctl.git;protocol=https;branch=issue-1-Create_initial_LKM_draft_v2"


#SRCREV = "a8bb7e621dd644f5ed1d102242573623dddfd7e0"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

#FILES_${PN}="/lib/modules/5.4.72-v7/extra"
#ALLOW_EMPTY_${PN} = "1"

RPROVIDES_${PN} += "kernel-module-gpio_ctl"

KERNEL_MODULE_AUTOLOAD += "gpio_ctl"
