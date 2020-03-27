#!/bin/sh
https://github.com/lolghurt/ill-advised-1-bigger-mags/blob/master/.circleci/zipMod.sh
# CHANGE ME
modFolderName="Ill-Advised-Modifications-2-Ship-Weapon-Pack"

version=$(git describe --tags)
zipName=$modFolderName-$version.zip
git archive master -o $zipName --prefix $modFolderName-$version/
mkdir -p ./artifacts
mv ./$zipName ./artifacts/