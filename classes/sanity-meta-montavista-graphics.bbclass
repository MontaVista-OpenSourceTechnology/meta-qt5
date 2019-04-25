addhandler mmgraphics_bbappend_distrocheck
mmgraphics_bbappend_distrocheck[eventmask] = "bb.event.SanityCheck"
python mmgraphics_bbappend_distrocheck() {
    skip_check = e.data.getVar('SKIP_META_MONTAVISTA_GRAPHICS_SANITY_CHECK') == "1"
    if 'mvista-graphics' not in e.data.getVar('DISTRO_FEATURES').split() and not skip_check:
        bb.warn("You have included the meta-montavista-graphics layer, but \
'mvista-graphics' has not been enabled in your DISTRO_FEATURES. Some bbappend files \
and preferred version setting may not take effect. See the meta-montavista-graphics README \
for details on enabling montavista graphics support.")
}
