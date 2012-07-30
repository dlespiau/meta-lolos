DESCRIPTION = "A console-only image that fully supports the target device \
hardware."

PACKAGE_GROUP_wayland = "task-wayland-weston"

IMAGE_FEATURES += "apps-console-core wayland"

LICENSE = "MIT"

inherit core-image
