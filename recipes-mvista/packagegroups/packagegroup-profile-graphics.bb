
SUMMARY = "Additional packages for graphics profile"
DESCRIPTION = "Additional packages for graphics profile"
PR = "r1"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
         packagegroup-profile-graphics \
         packagegroup-profile-graphics-qt5 \
         packagegroup-profile-graphics-clutter \
         packagegroup-profile-graphics-base \
         packagegroup-profile-graphics-sound \
         packagegroup-profile-graphics-misc \
         packagegroup-profile-graphics-gstreamer \
         packagegroup-profile-graphics-mesa \
"

RDEPENDS_packagegroup-profile-graphics-mesa = " \
	mesa-demos \
"

RDEPENDS_packagegroup-profile-graphics-misc = " \
	ruby \
"
RDEPENDS_packagegroup-profile-graphics-sound = " \
	alsa-state \
	alsa-tools \
"

GST_COMM = " \
	gstreamer1.0-libav \
        gstreamer1.0-omx \
	gstreamer1.0-plugins-ugly \
"

RDEPENDS_packagegroup-profile-graphics-gstreamer = " \
        ${@base_contains("LICENSE_FLAGS_WHITELIST", "commercial", "${GST_COMM}","",d)} \
"
RDEPENDS_packagegroup-profile-graphics-base = " \
         packagegroup-core-x11-xserver \
         packagegroup-core-x11 \
"

RDEPENDS_packagegroup-profile-graphics-clutter = " \
         packagegroup-core-clutter-core \
         clutter-1.0-examples \
"

RDEPENDS_packagegroup-profile-graphics-qt5 = " \
	packagegroup-qt5-toolchain-target \
	qtbase-plugins \
	qtbase-tools \
	qtdeclarative \
	qtdeclarative-plugins \
	qtdeclarative-tools \
	qtdeclarative-qmlplugins \
	qtmultimedia \
	qtmultimedia-plugins \
	qtmultimedia-qmlplugins \
	qtsvg \
	qtsvg-plugins \
	qtsensors \
	qtimageformats-plugins \
	qtsystems \
	qtsystems-tools \
	qtsystems-qmlplugins \
	qtscript \
	qtwebkit \
	qtwebkit-qmlplugins \
	qtgraphicaleffects-qmlplugins \
	qtconnectivity-qmlplugins \
	qtlocation-plugins \
	qtlocation-qmlplugins \
	qt5nmapper \
	qt5everywheredemo \
	qtwebkit-examples \
	qtwebkit \
	qt5-demo-extrafiles \
	qtimageformats \
"



RDEPENDS_packagegroup-profile-graphics = " \
         packagegroup-profile-graphics-qt5 \
         packagegroup-profile-graphics-clutter \ 
         packagegroup-profile-graphics-base \
         packagegroup-profile-graphics-sound \
         packagegroup-profile-graphics-misc \
         packagegroup-profile-graphics-gstreamer \
" 