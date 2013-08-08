
REM set path and file names
set filepath="d:/Dropbox/Krishna/regcmantic/src/main/resources/ontologies/"
set filename="SemReg_v5.owl"
set empty_filename="SemReg_v5_empty.owl"

REM -- delete the existing file  and copy the new one --
del  %filepath%%filename%
copy %filepath%%empty_filename% %filepath%%filename%