inherit multilib_script

python() {
    d.setVar("VERSION",d.getVar("PV").split("+")[0])
}

MULTILIB_SCRIPTS = "${PN}-dev:${includedir}/QtQml/${VERSION}/QtQml/private/qqmljsparser_p.h"
