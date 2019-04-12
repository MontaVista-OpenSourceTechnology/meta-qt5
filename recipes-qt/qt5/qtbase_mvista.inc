PACKAGECONFIG_DISTRO = "accessibility"

inherit multilib_script

MULTILIB_SCRIPTS = "${PN}-tools:${bindir}/qt.conf"
