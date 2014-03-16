LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_PRIVILEGED_MODULE := true
LOCAL_SRC_FILES := $(call all-subdir-java-files)
LOCAL_PACKAGE_NAME := CDSetup
LOCAL_CERTIFICATE := platform
include $(BUILD_PACKAGE)
