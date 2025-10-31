#!/bin/bash

# Membersihkan layar
clear

echo "==================================================="
echo "  Memulai proses Maven"
echo "==================================================="
echo ""

# Memeriksa format: ./run.sh -r com.juaracoding.labs.App
# $1 adalah "-r"
# $2 adalah "com.juaracoding.labs.App"
# -z "$2" memeriksa apakah argumen kedua kosong

if [ "$1" != "-r" ] || [ -z "$2" ]; then
    echo "[ERROR] Format salah."
    echo ""
    echo "Contoh Penggunaan:"
    echo "  ./run.sh -r com.juaracoding.labs.App"
    echo ""
    # Keluar dari script dengan status error
    exit 1
fi

# Ambil nama kelas dari argumen kedua
MAIN_CLASS=$2

echo "Menjalankan kelas: $MAIN_CLASS"
echo ""

# Jalankan Maven, berikan variabel sebagai mainClass
mvn clean compile exec:java -Dexec.mainClass=$MAIN_CLASS

echo ""
echo "==================================================="
echo "  Proses Selesai."
echo "==================================================="