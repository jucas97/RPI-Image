# Enable GPIO line names
do_deploy_append_raspberrypi2() {
    echo "# Enable GPIO line names" >>${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=gpio-line-names-bcm2709">>${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=pwm-2chan,pin=12,func=4,pin2=13,func2=4" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
