SUMMARY = "A custom console-only image that fully supports the target device hardware."

# IMAGE_FEATURES - List of features to be included into the image
IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL_append = "packagegroup-core-misc"

LICENSE = "MIT"

inherit core-image
