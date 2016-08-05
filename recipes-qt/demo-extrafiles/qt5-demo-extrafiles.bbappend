
# Doesn't quite build right or appear to exist
do_install_append () {
	rm -f ${D}${datadir}/applications/hellogl_es2*
	rm -f ${D}${datadir}/applications/hellowindow*
	rm -f ${D}${datadir}/applications/qt5basket*
	rm -f ${D}${datadir}/applications/qt5nesting*
	rm -f ${D}${datadir}/applications/qt5solarsystem*
}
