require qt5.inc
require qt5-git.inc

HOMEPAGE = "http://www.qt.io"
LICENSE = "GFDL-1.3 & BSD & ( GPL-3.0 & The-Qt-Company-GPL-Exception-1.0 | The-Qt-Company-Commercial ) & ( GPL-2.0+ | LGPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
"

# qemuarm build fails with:
# /OE/build/oe-core/tmp-glibc/work/armv5te-oe-linux-gnueabi/qtscript/5.4.1+gitAUTOINC+822df36f25-r0/git/src/3rdparty/javascriptcore/JavaScriptCore/assembler/AssemblerBuffer.h: In member function 'void QTJSC::AssemblerBuffer::putInt64Unchecked(int64_t)':
#/OE/build/oe-core/tmp-glibc/work/armv5te-oe-linux-gnueabi/qtscript/5.4.1+gitAUTOINC+822df36f25-r0/git/src/3rdparty/javascriptcore/JavaScriptCore/assembler/AssemblerBuffer.h:106:58: warning: cast from 'char*' to 'int64_t* {aka long long int*}' increases required alignment of target type [-Wcast-align]
#             *reinterpret_cast<int64_t*>(&m_buffer[m_size]) = value;
#                                                          ^
#{standard input}: Assembler messages:
#{standard input}:22: Error: selected processor does not support Thumb mode `stmdb sp!,{r1-r3}'
#{standard input}:23: Error: selected processor does not support Thumb mode `stmdb sp!,{r4-r8,lr}'
#{standard input}:30: Error: lo register required -- `ldmia sp!,{r4-r8,lr}'
#{standard input}:43: Error: lo register required -- `ldmia sp!,{r4-r8,lr}'
ARM_INSTRUCTION_SET_armv4 = "arm"
ARM_INSTRUCTION_SET_armv5 = "arm"

DEPENDS += "qtbase"

# The same issue as in qtbase:
# http://errors.yoctoproject.org/Errors/Build/44915/
LDFLAGS_append_x86 = "${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', ' -fuse-ld=bfd ', '', d)}"

SRCREV = "da4e4ac0c2c18d7941c218979aa352a86d71df31"
