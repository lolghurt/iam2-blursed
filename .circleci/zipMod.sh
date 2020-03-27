#!/bin/sh
https://github.com/lolghurt/iam2-blursed/blob/master/.circleci/zipMod.sh
# CHANGE ME
modFolderName="IAM-Part-2-Blursed-Content"

version=$(git describe --tags)
zipName=$modFolderName-$version.zip
git archive master -o $zipName --prefix $modFolderName-$version/
mkdir -p ./artifacts
mv ./$zipName ./artifacts/
