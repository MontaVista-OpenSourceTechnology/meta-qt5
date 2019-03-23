require ${@bb.utils.contains('DISTRO_FEATURES', 'mvista-graphics', '${BPN}_mvista.inc', '', d)}
