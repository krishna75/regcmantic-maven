
REM set path and file names
set filepath="D:\Dropbox\Krishna\NetBeansProjects\mapping_files\ontologies\"
set filename="SemReg_v4.owl"
set empty_filename="SemReg_v4_empty.owl"

REM -- delete the existing file  and copy the new one --
del  %filepath%%filename%
copy %filepath%%empty_filename% %filepath%%filename%