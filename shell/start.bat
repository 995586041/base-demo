@echo off

set ELK_HOME="F:\dev-soft\elk"
set ES_HOME="F:\dev-soft\elk\elasticsearch-6.3.2\bin"
set ES_HEADER_HOME="F:\dev-soft\elk\elasticsearch-head-master"
set LOGSTASH_HOME="F:\dev-soft\elk\logstash-6.3.2"
set KIBANA_HOME="F:\dev-soft\elk\kibana-6.3.2-windows-x86_64\bin"

echo start es
start "es" "%ES_HOME%\elasticsearch.bat"

echo start es-header
start "es-header" /d %ES_HEADER_HOME% cmd /k "grunt server"

echo start logstash
start "logstash" /d %LOGSTASH_HOME% cmd /k "bin\logstash -f config\log4j_to_es.conf"

echo start kibana
start "kibana" "%KIBANA_HOME%\kibana.bat"