# Enable GPIO line names
do_deploy_append_raspberrypi2() {
    echo "# Enable GPIO line names" >>${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=gpio-line-names-bcm2709">>${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
