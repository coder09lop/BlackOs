import os
import subprocess
import sys

def ToolsInstaller():
    #install hacking tools
    print("Installing hacking tools...")
    subprocess.run(['apt-get', 'update'])
    subprocess.run(['apt-get', 'install', '-y', 'nmap', 'hydra'])
    os.system("sudo apt install wine64")
    os.system("sudo apt install python3-pip")
    os.system("pip3 install requests")
    os.system("pip3 install paramiko")
    os.system("pip3 install scapy")
    os.system("pip3 install sqlmap")
    os.system("pip3 install metasploit")
    os.system("pip3 install nmap")
    os.system("pip3 install python3-requests")
    os.system("pip3 install python3-paramiko")
    os.system("pip3 install python3-scapy")
    os.system("pip3 install python3-sqlmap")
    os.system("pip3 install python3-metasploit")
    os.system("pip3 install python3-nmap")
    #endd