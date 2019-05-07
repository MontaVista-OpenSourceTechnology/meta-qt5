PACKAGECONFIG_DISTRO = "accessibility"

inherit multilib_script

MULTILIB_SCRIPTS = "${PN}-tools:${bindir}/qt.conf"

pkg_postinst_${PN}-tools () {
sed -i \
    -e 's:HostSpec =.*:HostSpec = ${TARGET_MKSPEC}:g' \
    -e 's:TargetSpec =.*:TargetSpec = ${TARGET_MKSPEC}:g' \
    $D${bindir}/qt.conf-${MULTILIB_SUFFIX}
}

pkg_postinst_${PN}-mkspecs () {
sed -i 's: cross_compile : :g' $D${OE_QMAKE_PATH_ARCHDATA}/mkspecs/qconfig.pri
sed -i \
    -e 's: cross_compile : :g' \
    -e 's:HOST_QT_TOOLS =.*::g' \
    $D${OE_QMAKE_PATH_ARCHDATA}/mkspecs/qmodule.pri
}

