SUMMARY = "Task to install graphics packages"
LICENSE = "MIT"
PR = "r26"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

GFX_WAYLAND = "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', "weston-init", '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', "weston-examples", '', d)} \
"

OPENGL_PKGS = "\
    libegl \
    glmark2 \
    kmscube \
"

RDEPENDS:${PN} = "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', "${OPENGL_PKGS}", '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', "${GFX_WAYLAND}", '', d)} \
    ${@bb.utils.contains('MACHINE_FEATURES', 'gc320', 'ti-gc320-tests', '', d)} \
"
