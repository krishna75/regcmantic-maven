REM set path and file names, (settin varibales should avoid space between the varibale names and the value"
set filepath="D:\Dropbox\Krishna\NetBeansProjects\mapping_files\ontologies\"
set backup_path="D:\Dropbox\Krishna\NetBeansProjects\mapping_files\ontologies\backup\"
set filename="SemReg_v4.owl"
set backup_filename="SemReg_v4_Populated.owl"

REM -- delete the existing file  and copy the new one --
del  %backup_path%%backup_filename%
copy %filepath%%filename%  %backup_path%%backup_filename%
