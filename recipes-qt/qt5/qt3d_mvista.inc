inherit multilib_script

python() {
    d.setVar("VERSION",d.getVar("PV").split("+")[0])
}

MULTILIB_SCRIPTS = "${PN}-dev:${includedir}/Qt3DCore/${VERSION}/Qt3DCore/private/qt3dcore-config_p.h"
