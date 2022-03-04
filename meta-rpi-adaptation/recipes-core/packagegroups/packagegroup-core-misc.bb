SUMMARY = "Software image customization packagegroup"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    libgpiod \
    libgpiod-tools \
"