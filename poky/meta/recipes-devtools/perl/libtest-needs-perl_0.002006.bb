SUMMARY = "Skip tests when modules not available"
DESCRIPTION = "Skip test scripts if modules are not available. \
The requested modules will be loaded, and optionally have their versions \
checked. If the module is missing, the test script will be skipped. Modules \
that are found but fail to compile will exit with an error rather than skip."

HOMEPAGE = "https://metacpan.org/release/Test-Needs"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

CPAN_NAME = "Test-Needs"
CPAN_AUTHOR = "HAARG"

LIC_FILES_CHKSUM = "file://README;md5=3f3ccd21a0a48aa313db212cc3b1bc09;beginline=88;endline=89"

DEPENDS += "perl"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/${CPAN_AUTHOR}/${CPAN_NAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "d5c96d51d8d5510f7c0b7f354c49af1c"
SRC_URI[sha256sum] = "77f9fff0c96c5e09f34d0416b3533c3319f7cd0bb1f7fe8f8072ad59f433f0e5"

S = "${WORKDIR}/${CPAN_NAME}-${PV}"

inherit cpan ptest-perl

RDEPENDS_${PN}-ptest += "perl-module-test-more"

BBCLASSEXTEND = "native"