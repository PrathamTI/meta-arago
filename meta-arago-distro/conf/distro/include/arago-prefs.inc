PREFERRED_PROVIDER_virtual/gettext = "gettext"

PREFERRED_PROVIDER_virtual/kernel:append = "${ARAGO_KERNEL_SUFFIX}"

PREFERRED_RPROVIDER_libnss-mdns = "avahi-libnss-mdns"

VIRTUAL-RUNTIME_dbus = "dbus-broker"

# Bump mesa-demos to include some patches not in a tagged release
PREFERRED_VERSION_mesa-demos = "9.0.0+git"
