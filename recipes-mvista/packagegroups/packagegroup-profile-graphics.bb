
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
         packagegroup-profile-graphics-qt5-demos \
"

RDEPENDS_packagegroup-profile-graphics = " \
         packagegroup-profile-graphics-qt5 \
         packagegroup-profile-graphics-clutter \ 
         packagegroup-profile-graphics-base \
         packagegroup-profile-graphics-sound \
         packagegroup-profile-graphics-misc \
         packagegroup-profile-graphics-gstreamer \
         packagegroup-profile-graphics-mesa \
         packagegroup-profile-graphics-qt5-demos \
" 

RDEPENDS_packagegroup-profile-graphics-mesa = " \
	mesa-demos \
	mesa-megadriver \
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
        ${@bb.utils.contains("LICENSE_FLAGS_WHITELIST", "commercial", "${GST_COMM}","",d)} \
"
RDEPENDS_packagegroup-profile-graphics-base = " \
         packagegroup-core-x11-xserver \
         packagegroup-core-x11 \
         xterm \
         xclock \
         twm \
         matchbox-desktop \
         matchbox-wm \
         matchbox-session-sato \
         matchbox-keyboard \
         matchbox-keyboard-applet \
         matchbox-keyboard-im \
         matchbox-config-gtk \
	 matchbox-terminal \
"

RRECOMMENDS_packagegroup-profile-graphics-base = " \
         xf86-video-modesetting \
         xserver-xorg-extension-glx \
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
	qtwebkit \
	qtimageformats \
"

RDEPENDS_packagegroup-profile-graphics-qt5-demos = " \
	cinematicexperience \
	qt5everywheredemo \
	qt5ledscreen \
	qt5nmapcarousedemo \
	qt5nmapper \
	qtsmarthome \
	quitbattery \
	quitindicators \
	qtwebkit-examples \
        qt5-demo-extrafiles \
"


