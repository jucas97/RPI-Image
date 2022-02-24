SUMMARY = "A custom console-only image that fully supports the target device hardware."

# IMAGE_FEATURES - List of features to be included into the image
IMAGE_FEATURES += "ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image
