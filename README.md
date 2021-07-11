# elk-stack-logging-example
centralize logging in microservice architecture using ELK Stack

Step 1 ->need to install elasticsearch

C:\elasticsearch-7.7.0\bin>elasticsearch.bat
http://localhost:9200/

Step 2 ->install logstash
Step 3 ->install kibana

C:\kibana-7.7.0\bin>kibana.bat
http://localhost:5601

Step 4 ->Configure logstash conf file

Step 5 -> Go to kibana
          ->create index pattern
	  ->select logstash current time stamp entry
	  ->configure (timestamp, etc)
	  -> go to discover


#conf file need to place in the logstash bin folder

C:\logstash-7.7.0\logstash-7.7.0\bin\logstash_config_custom.conf

input {
 file {
  path => "C:/ELK_LOGS/elk-stack.log"
  start_position =>"beginning"
 }
}

output {
stdout { codec => rubydebug 
}

 #sending properly parsed log events to elasticsearch
 elasticsearch {
 hosts => ["localhost:9200"]
}
}

