PR .= ".2"

inherit update-alternatives

ALTERNATIVE_${PN} = "resize"
ALTERNATIVE_PRIORITY[resize] = "40"
ALTERNATIVE_LINK_NAME[resize] = "${bindir}/resize"
