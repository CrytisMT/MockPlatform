# MockPlatform
接口mock平台

需要配合nginx使用，增加如下location

        	location ~ /mockserver/ {
            proxy_pass http://mock_001;
            proxy_set_header   Host             $host;
            proxy_set_header   X-Real-IP        $remote_addr;
            proxy_set_header   X-Forwarded-For  $proxy_add_x_forwarded_for;

            rewrite ^(.*)$ /mockserver?url=$uri&query=$args;
    }
