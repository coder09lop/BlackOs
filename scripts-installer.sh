#!/bin/bash
# Author: [Coder09lop]
!cd ..
mkdir -p scripts
cd scripts
#installing required packages
!pip install -r requirements.txt
echo "select your hacking version"
echo "1. basic"
echo "2. advanced"
read -p "Enter your choice: " hacking_version
if [ $hacking_version -eq 1 ]; then
    echo "basic hacking version selected"
    !cd ..
    !cd scripts
    !python basic_hacking.py
elif [ $hacking_version -eq 2 ]; then
    echo "advanced hacking version selected"
    !cd ..
    !cd scripts
#if scripts dir not founded
if [ ! -d "scripts" ]; then
    echo "scripts directory not found"
else
    !python advanced_hacking.py
    fi
fi

