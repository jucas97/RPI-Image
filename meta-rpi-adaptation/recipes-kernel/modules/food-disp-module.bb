SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "CLOSED"

inherit module

SRC_URI = "git://github.com/jucas97/food-dispenser-kernel-module.git;protocol=https;branch=issue-7-Integrate_creation_and_control_of_user-space_selected_pwm_channel"

SRCREV = "d9c2390036d7d5b4ab2eb6177ef11d56f764db4e"

S = "${WORKDIR}/git"

do_install_append() {
    install ${S}/food_disp_shared.h ${D}${includedir}
}

RPROVIDES_${PN} += "kernel-module-food_disp"
