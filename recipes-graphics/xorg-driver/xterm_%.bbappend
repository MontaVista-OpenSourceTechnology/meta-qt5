PR .= ".1"

inherit update-alternatives

ALTERNATIVE_${PN} = "resize"
ALTERNATIVE_PRIORITY[xterm] = "40"
ALTERNATIVE_LINK_NAME[resize] = "${bindir}/resize"
