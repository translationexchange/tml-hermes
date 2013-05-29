(ns tr8n.hermes.main
  (:require [flatland.hermes.server :as hermes]))

(defn main [& args]
  (let [debug (and (= "--debug" (first args))
                   (not= "false" (second args)))]
    (def server
      (hermes/init {:message-retention 5000
                    :debug debug
                    :websocket-port 2971
                    :http-port 2972}))))
